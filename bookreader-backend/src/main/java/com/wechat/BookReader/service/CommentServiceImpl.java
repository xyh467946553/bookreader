package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.CommentService;
import com.wechat.BookReader.dao.BookRepo;
import com.wechat.BookReader.dao.CommentRepo;
import com.wechat.BookReader.entity.Book;
import com.wechat.BookReader.entity.Comment;
import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    BookRepo bookRepo;

    @Override
    public BasicResponse setComment(String username, int bookId, String comment,double star){
        String time = TimeUtil.getNowTime();
        commentRepo.save(new Comment((int)commentRepo.count() + 1,
                comment,
                username,
                bookId,
                time,
                star));
        List<Comment> commentList = commentRepo.findByBookId(bookId);
        double resStar = 0;
        for(int i=0;i<commentList.size();i++){
            Comment comment0 = commentList.get(i);
            resStar = resStar + comment0.getStar();
        }
        resStar = resStar / commentList.size();

        Book book = bookRepo.findById(bookId).get();
        book.setStar(resStar);
        bookRepo.save(book);
        return new BasicResponse(true, "");
    }
}
