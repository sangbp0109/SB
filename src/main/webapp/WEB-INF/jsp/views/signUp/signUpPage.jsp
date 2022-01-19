<%--
  Created by IntelliJ IDEA.
  User: sangb
  Date: 2022-01-14
  Time: 오후 4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>

<h1>회원가입 페이지 입니다.</h1><br>
<br>
<br>
    <div class="top">
        <div class="topTitle">회원가입 작성</div>
    </div><br><br>
    <div class ="middle">
        <div class="idBox">아이디
            <input type="text" class="id" id="id" name="id" placeholder="아이디를 입력 해주세요." autofocus /><br><br>
        </div>
        <div class="password1Box">비밀번호
            <input type="text" class="password1" id="password1" name="password1" placeholder="비밀번호를 입력 해주세요." /><br><br>
        </div>
        <div class="password2Box">비밀번호 확인
            <input type="text" class="password2" id="password2" name="password2" placeholder="비밀번호 재입력." /><br><br>
        </div>
        <div class="nameBox">이름
            <input type="text" class="name" id="name" name="name" placeholder="이름을 입력 해주세요." /><br><br>
        </div>
        <div class="birthDayBox">생년월일
            <input type="text" class="birthDay" id="birthDay" name="birthDay" placeholder="생년월일을 입력 해주세요." /><br><br>
        </div>
        <div class="area1Box">시/도
            <input type="text" class="area1" id="area1" name="area1" placeholder="도시를 선택 해주세요." /><br><br>
        </div>
        <div class="area2Box">시/구
            <input type="text" class="area2" id="area2" name="area2" placeholder="시/구를 선택 해주세요." /><br><br>
        </div>
        <div class="area3Box">동/면/읍
            <input type="text" class="area3" id="area3" name="area3" placeholder="동/면/읍을 선택 해주세요." /><br><br>
        </div>
        <div class="eMailBox">이메일
            <input type="text" class="eMail" id="eMail" name="eMail" placeholder="이메일을 입력 해주세요." /><br><br>
        </div>
        <div class="phoneBox">핸드폰 번호
            <input type="text" class="phone" id="phone" name="phone" placeholder="핸드폰 번호를 입력 해주세요." /><br><br>
        </div>
    </div><br><br>
    <div class="bottom">
        <div clsss="bottomTitle">모두 작성 했다면</div>
        <div class="bottomBtn">
            <input type="button" value="가입취소" class="signCancelBtn" onclick="fnSignCancel(this.form)" />
            <input type="button" value="가입하기" class="signUpBtn" onclick="fnSignUp(this.form)" />
            <input type="submit" value="가입하기">
        </div>
    </div>


    <script type="text/javascript">

        /* 회원가입 취소 */
        function fnSignCancel(f) {
            alert("이전 페이지로 돌아 가시겠습니까?");
                    history.back();
        }

    </script>


</body>
</html>
