package com.wechat.BookReader.bl;

import com.wechat.BookReader.response.BookInfoVO;
import com.wechat.BookReader.response.BookSimpleInfoVO;

public interface BookService {
    /**
     * 获取全部图书
     * @return
     */
    BookSimpleInfoVO[] getBooks();

    /**
     * 查看图书详情
     * @param bookId
     * @return
     */
    BookInfoVO getBookInfo(int bookId);
}
