package com.wechat.BookReader.parameter;

public class UserLoginParam {
    private String code = "";

    private String username = "";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserLoginParam() {
    }

    public UserLoginParam(String code, String username) {
        this.code = code;
        this.username = username;
    }
}
