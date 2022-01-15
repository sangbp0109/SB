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

<script type = "text/javascript">

    // 로그인 버튼을 직접 마우스로 눌렀을 때
    function fnUserLogin() {
        //var f = document.loginForm

        var id = document.getElementById('id');
        var pw = document.getElementById('pw');
        if (id.value == '' || pw.value == '') {
            alert("아이디와 비밀번호를 모두 입력하세요.");
            return false;
        }
        if (id.value != '' || pw.value != '') {
            alert("아이디 또는 비밀번호가 일치하지 않습니다.");
            return false;
        } else {
            action = "userLogin.do";
            //submit();
        }
    }

</script>

<body>

<h1>개씹자지좆보지입니다.</h1><br>
<br>
<div class = "wrap">
    <div class ="top">
        <div class ="topTitle">로그인</div><br><br>
    </div>
    <div class = "middleTop">
        <div class = "login">
            <form class="loginForm" method="post">
                <div class = "idBox">
                  <input type="text" class="id" id="id" name="id" placeholder="아이디를 입력 해주세요." autofocus /><br><br>
                </div>
                <div class = "passwordBox">
                    <input type="password" class="pw" id="pw" name="pw" placeholder="비밀번호를 입력 해주세요." /><br><br>
                </div>
                <div class = "buttonBox">
                    <input type="button" value="로그인" class="loginBtn" onclick="fnUserLogin(this.form)" /><br><br>
                </div>
            </form>
        </div>
    </div>
    <div class = "middleBottom">
        <div class = "middleBottomTitle">아이디 또는 비밀번호가 생각이 나지 않는다면?</div>
            <a href="findIdPage.do">아이디 찾기</a><br><br>
            <a href="findPasswordPage.do">비밀번호 찾기</a><br><br>
    </div>
    <div class="bottom">
        <div class="bottomTitle">처음 오신 분이라면?</div>
        <a href="signUpPage.do">회원가입</a><br>
    </div>
</div>

</body>
</html>

