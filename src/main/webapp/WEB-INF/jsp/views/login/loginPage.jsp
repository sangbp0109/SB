<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 2022-01-15
  Time: 오전 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>

<h1>개씹자지좆보지입니다.</h1><br>
<br>
<div class = "top">
    <div class ="topTitle">로그인</div><br><br>
    <div class = "middleTop">
        <div class = "login">
            <form class="loginForm">
                <div class = "idBox">
                  <input type="text" class="id" id="id" name="id" placeholder="아이디" /><br><br>
                </div>
                <div class = "passwordBox">
                    <input type="password" class="pw" id="pw" name="pw" placeholder="비밀번호" /><br><br>
                </div>
                <div class = "buttonBox">
                    <input type="button" value="로그인" class="loginBtn" onclick="fn_login(this.form)" /><br><br>
                </div>
            </form>
        </div>
        <div class = "middleBottomTitle">아이디찾기 / 비밀번호찾기</div>
        <div class = "middleBottom">
            <a href="findIdPage.do">아이디 찾기</a><br><br>
            <a href="findPasswordPage.do">비밀번호 찾기</a><br><br>
        </div>
    </div>
</div>

</body>
</html>

