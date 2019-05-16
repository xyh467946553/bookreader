package com.wechat.BookReader.bl;

import com.wechat.BookReader.response.BasicResponse;

public interface LoginService {
    /**
     * 用户登陆
     * @param openId
     * @param userName
     * @return
     */
    BasicResponse userLogin(String openId, String userName);
}
