package org.scoula.ex3.dai;

public class LoingDTO {
    private String userid;
    private String passwd;

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

    public LoingDTO(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;


    }
}
