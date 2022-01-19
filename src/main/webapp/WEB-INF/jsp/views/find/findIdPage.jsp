<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 2022-01-15
  Time: 오전 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>아이디 찾기</title>
</head>
<body>
    <div class="top">
        <div>정보를 입력 해주세요.</div>
    </div><br><br>
    <div class="middle">
        <div class="nameBox">이름
            <input type="text" class="name" id="name" name="name" placeholder="이름을 입력 해주세요." autofocus /><br><br>
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
        <div class="bottomBtn">
            <input type="button" value="생각남ㅋ" class="cancelBtn" onclick="fnFindCancel(this.form)" />
            <input type="button" value="아이디 찾기" class="findIdBtn" onclick="fnFindId(this.form)" />
        </div>
    </div>


    <script type="text/javascript">

        /* 아이디 찾기 취소 */
        function fnFindCancel(f) {
            alert("이전 페이지로 돌아 가시겠습니까?");
                history.back();
        }

    </script>

</body>
</html>
