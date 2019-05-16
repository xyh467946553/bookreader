package com.wechat.BookReader.parameter;

public class UserLoginParam {
    private String wx_id = "";

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }

    public UserLoginParam() {
    }

    public UserLoginParam(String wx_id) {
        this.wx_id = wx_id;
    }
}
