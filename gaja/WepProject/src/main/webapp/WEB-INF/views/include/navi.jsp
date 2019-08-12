<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<% String id = (String)session.getAttribute("id");%>
</head>
<body>


<!-- 상단바 시작 -->

<div class="navbar navbar-default navbar-fixed-top" style="background-color:#2c3338;">
<br>
      <div class="container">
   		<div class="container-fluid">
    		
    		<div class="row">
    	 	<p align="right" style="text-align: right;">
    	 	
     		<%if("admin".equals(id)){%> 
     		<font color="white"><a href="memberinfo">회원정보</a></font> &nbsp; &nbsp;  
     		<font color="white"><a href="orderlist">주문내역관리</a></font> &nbsp; &nbsp;
     		<font color="white"><a href="upload">상품업로드</a></font> &nbsp; &nbsp; 
     		<font color="white"><a href="board">문의게시판</a></font> &nbsp; &nbsp; 
     		<%} 
     		else{%>
     		<font color="white"><a href="mypage">마이페이지</a></font>&nbsp; &nbsp;  
     		<font color="white"><a href="inorder">주문내역</a></font> &nbsp; &nbsp;
     		<font color="white"><a href="cartlist">장바구니</a></font>  &nbsp; &nbsp; 
     		<font color="white"><a href="board">문의게시판</a></font> &nbsp; &nbsp; 
     		<%}%>
	  
	 		<%if(id==null){%><a href="login"><font color="white">로그인</font></a><%} 
	 		else{ %><a href="logout"><font color="white">로그아웃</font></a> <%}%> 
	 		</p>
	 		
   		<p align="center" style="text-align: center;">
    		<a href="main">
    		<img src="https://image-logo.alba.kr/data_image2/jobimg/201806/2018060321115155265_0.png" style="height:100px"/>
    		</a>
    	</p>
    
 
		<p align="center" style="text-align: center;"> 
			<a href="/list?cate=top" ><font size="4px">TOP</font></a> &nbsp;
			<a href="/list?cate=bottom"><font size="4px">BOTTOM</font></a> &nbsp; 
			<a href="/list?cate=shoes"><font size="4px">SHOSE</font></a> &nbsp;
			<a href="/list?cate=etc"><font size="4px">ETC</font></a> 
		</p>  
   
     		</div>
  	  	</div>


  		<div class="form--search" style="width:200px;float:right;"  >
          <input id="keyword" type="text" autofocus placeholder="Search your fassion" onkeypress="if(isEnterPressed()){goCategoryPage();}"/>
          <input type="submit" value="SEARCH" onclick="search(); return false"/>
         <p></p>
         </div>
         <p></p>

     </div>
        
     
</div>

<br><br><br><br><br><br><br><br><br><br><br>
     


</body>
</html>