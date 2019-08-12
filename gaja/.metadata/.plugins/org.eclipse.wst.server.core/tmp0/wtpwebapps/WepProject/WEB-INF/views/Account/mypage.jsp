<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ page import = "gaja.project.domain.*" %>
  

<!doctype html>
<html>
<head>
   <meta charset="UTF-8">
   <title> GAJA.shoppingmall </title>
   
   <%MemberVO my = (MemberVO)request.getAttribute("mypage"); //상품리스트 가져오기  %>
   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" sype="text/css" href = "/resources/css/mypage.css">
</head>


<body class="align"> 

 <div class="site__container">
    	<div class="grid__container">
      	<form action=mypageup method="post" class="form form--login" onsubmit="return joincheck();">

		<div style="text-align: center;"><span style="color: rgb(238, 130, 238);"><strong><span style="font-size: 24px;">MY PAGE </span></strong></span></div>
<br>
    		<div class="form__field">
          	<label class="fontawesome-user" for="login__username"><span class="hidden">이름</span></label>
          	<input id="uname" type="text" class="form__input" value="<%=my.getName()%>" name="name" readonly required>
        	</div>

 		<div class="form__field">
          <label class="fontawesome-user" for="login__username"><span class="hidden">아이디</span></label>
          <input id="uid" type="text" class="form__input" value="<%=my.getId()%>" name="id" readonly  required>
        </div>
        
        <div class="form__field">
          <label class="fontawesome-lock" for="login__password"><span class="hidden">비밀번호</span></label>
          <input id="upw" type="password" class="form__input" name="pw" onkeyup = "pwcheck()" value="" required>
        </div>

  		<div class="form__field">
          <label class="fontawesome-lock" for="login__password"><span class="hidden">비밀번호확인</span></label>
          <input id="upw2" type="password" class="form__input"  onkeyup = "pwcheck()" required>   
        </div>
 
 <p align="center" style="text-align: center;"><input type ="text" id = "pwname" value = "" style="width:100%;border:0px solid white; background-color:transparent;" placeholder="비밀번호를 동일하게 입력하세요" disabled></input></p>
<br>

  		<div class="form__field">
          <label class="fontawesome-user" for="login__username"><span class="hidden">핸드폰번호</span></label>
          <input id="uphone" type="text" class="form__input" name="phone" value="<%=my.getPhone()%>" required>
        </div>
        
  		<div class="form__field">
          <label class="fontawesome-user" for="login__username"><span class="hidden">주소</span></label>
          <input id="uaddress" type="text" class="form__input " name="address" value="<%=my.getAddress()%>" required>
        </div>

        <div class="form__field">
          <input type="submit" value="UPDATE"> &nbsp;
          <input type="submit" value="Cencel" onclick="location.href='history.go(-1)'; return false;">
        </div>

		<input type="hidden" name="mnum" value=<%=my.getMnum()%>>
      </form>
    	</div>

 </div>


<script>
var idok = "false";
var passwordcheck = "false";


function joincheck(){  //id 및 비밀번호 확인후 회원가입 처리페이지로 이동 
	if(passwordcheck == "false"){	  
		  alert("비밀번호 체크를 하세요");  
		  return false;
	 }   
	  return true; 
}

function pwcheck(){  //비밀번호 재입력 확인 메소드  	  
	  var pw1 = "";
	  var pw2 = "";
	  	  
	  pw1 = $("#upw").val();  
	  pw2 = $("#upw2").val();
  
	  if(pw1 == pw2 &&  pw1 != ""){	  
   			$("#pwname").val("비밀번호가 일치합니다").css("color","blue");;	  
		  	passwordcheck= "true";  
		} 
	  
	  else { $("#pwname").val("비밀번호가 불일치합니다").css("color","red");}
	    	  
}

function search(){

	var keyword = $("#keyword").val();
	location.href= "search?cate=all&keyword="+keyword;

}

</script>

</body>
</html>