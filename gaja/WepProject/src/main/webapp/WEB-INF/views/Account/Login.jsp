<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!doctype html>
<html>
<head>


<script> 

var res = "${msg}";
var res2 = "${msg2}";


if(res == null || res =="" ){} 

else{

if(res=="false" ){
	
	alert("회원가입이 실패하였습니다.");

} else if (res=="success"){
	alert("회원가입이 성공하였습니다.");
	
}

}


if(res2 == null || res2 =="" ){} 

else{
	
	alert(res2);

}


</script>
   <meta charset="UTF-8">
   <title>GAJA.shoppingmall</title>


<link rel="stylesheet" href="/resources/css/main.css">


</head>

<!--소현정-->
 <body class="align">
    <div class="site__container site__margin">
      <div class="grid__container">
        <form class="form form--login" action="" method="post">
          <div class="title__text">GAJA LOGIN</div>
          <div class="form__margin">
            <div class="form__field form__margin">
              <label class="fontawesome-user" for="login__username"><span class="hidden">Username</span></label>
              <input class="form__input" name="id" id="login__username" type="text" placeholder="Username" required>
            </div>
            <div class="form__field">
              <label class="fontawesome-lock" for="login__password"><span class="hidden">Password</span></label>
              <input class="form__input" name="pw" id="login__password" type="password" placeholder="Password" required>
            </div>
          </div>
          <div class="form__field form__margin"><input type="submit" value="LogIn"></div>
        </form>
        <form class="form form--login" action="join" method="get">
          <div class="form__field"><input type="submit" value="Join" onclick="location.href='join'; return false"></div>
        </form>
      </div>
    </div>
  </body>
  
</html>