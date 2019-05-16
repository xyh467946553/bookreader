package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.CommentService;
import com.wechat.BookReader.dao.CommentRepo;
import com.wechat.BookReader.entity.Comment;
import com.wechat.BookReader.response.BasicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public BasicResponse setComment(String username, int bookId, String comment){
        commentRepo.save(new Comment((int)commentRepo.count() + 1, comment, username, bookId));
        return new BasicResponse(true, "");
    }
}
