package com.wechat.BookReader.bl;

import com.wechat.BookReader.response.BasicResponse;

public interface LoginService {
    /**
     * 用户登录
     * @param code
     * @return
     */
    BasicResponse userLogin(String code);
}
