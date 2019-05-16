package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.CommentService;
import com.wechat.BookReader.response.BasicResponse;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Override
    public BasicResponse setComment(String username, int bookId, String comment){
        //TODO

        return null;
    }
}
