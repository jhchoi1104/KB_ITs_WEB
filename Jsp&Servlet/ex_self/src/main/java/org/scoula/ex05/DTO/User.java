package org.scoula.ex05.DTO;

public class User {
    private String userid;
    private String passwd;
    private String birthday;
    private String age;
    private String habit;
    private String star;

    public User(String userid, String passwd, String birthday, String age, String habit, String star) {
        this.userid = userid;
        this.passwd = passwd;
        this.birthday = birthday;
        this.age = age;
        this.habit = habit;
        this.star = star;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
}
