<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 2022-01-15
  Time: 오전 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>비밀번호 찾기</title>
</head>
<body>
    <div class="top">
        <div>정보를 입력 해주세요.</div>
    </div><br><br>
    <div class="middle">
        <div class="idBox">아이디
            <input type="text" class="id" id="id" name="id" placeholder="아이디를 입력 해주세요." autofocus /><br><br>
        </div>
        <div class="nameBox">이름
            <input type="text" class="name" id="name" name="name" placeholder="이름을 입력 해주세요." /><br><br>
        </div>
        <div class="birthDayBox">생년월일
            <input type="text" class="birthDay" id="birthDay" name="birthDay" placeholder="생년월일을 입력 해주세요." /><br><br>
        </div>
        <div class="phoneBox">핸드폰 번호
            <input type="text" class="phone" id="phone" name="phone" placeholder="핸드폰 번호를 입력 해주세요." /><br><br>
        </div>
    </div>
    <div class="bottom">
        <div class="bottomTitle">다음</div>
        <div>
            <input type="button" value="생각남ㅋ" class="signCancelBtn" onclick="fnFindCancel(this.form)" />
            <input type="button" value="비밀번호 찾기" class="findPasswordBtn" onclick="fnFindPassword(this.form)" />
        </div>
    </div>


    <script type="text/javascript">

    /* 비밀번호 찾기 취소 */
    function fnFindCancel(f) {
    /*(confirm("회원가입을 취소하시겠습니까?") == true) {  */
        if (confirm("생각났냐?ㅋㅋ") == true) {
            if (confirm("씹자지좆보지") == true) {
                history.back();
            }
        }
    }

    </script>
</body>
</html>
