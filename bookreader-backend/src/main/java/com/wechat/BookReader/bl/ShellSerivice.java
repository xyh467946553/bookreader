package com.wechat.BookReader.bl;

import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.response.BookSimpleInfoVO;

public interface ShellSerivice {
    /**
     * 把书添加至书架
     * @param bookId
     * @return
     */
    BasicResponse addBookToShell(int bookId, String openId);

    /**
     * 查看书架里的所有书
     * @param openId
     * @return
     */
    BookSimpleInfoVO[] getShell(String openId);
}
