package com.wechat.BookReader.bl;

import com.wechat.BookReader.response.BasicResponse;

public interface CommentService {
    /**
     * 发表评论
     * @param username
     * @param bookId
     * @param comment
     * @return
     */
    BasicResponse setComment(String username, int bookId, String comment);
}
