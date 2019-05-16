package com.wechat.BookReader.bl;

import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.response.BookSimpleInfoVO;

public interface ShelfSerivice {
    /**
     * 把书添加至书架
     * @param bookId
     * @return
     */
    BasicResponse addBookToShelf(int bookId, String openId);

    /**
     * 将书移除书架
     * @param bookId
     * @param openId
     * @return
     */
    BasicResponse deleteBookFromShelf(int bookId, String openId);

    /**
     * 查看书架里的所有书
     * @param openId
     * @return
     */
    BookSimpleInfoVO[] getShelf(String openId);
}
