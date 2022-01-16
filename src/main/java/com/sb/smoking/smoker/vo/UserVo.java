package com.sb.smoking.smoker.vo;

public class UserVo {

    private String id;          /* 아이디 */
    private String password1;   /* 비밀번호 */
    private String password2;   /* 비밀번호확인 */
    private String name;        /* 이름 */
    private int birthday;       /* 생년월일 */
    private String area1;       /* 시/도 */
    private String area2;       /* 시 */
    private String area3;       /* 동/면/읍 */
    private String email;       /* 이메일 */
    private int phone;          /* 핸드폰번호 */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getArea1() {
        return area1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getArea3() {
        return area3;
    }

    public void setArea3(String area3) {
        this.area3 = area3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserVo{" +
            "id='" + id + '\'' +
            ", password1='" + password1 + '\'' +
            ", password2='" + password2 + '\'' +
            ", name='" + name + '\'' +
            ", birthday=" + birthday +
            ", area1='" + area1 + '\'' +
            ", area2='" + area2 + '\'' +
            ", area3='" + area3 + '\'' +
            ", email='" + email + '\'' +
            ", phone=" + phone +
            '}';
    }
}
