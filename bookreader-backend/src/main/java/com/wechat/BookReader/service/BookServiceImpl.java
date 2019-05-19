package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.BookService;
import com.wechat.BookReader.dao.BookRepo;
import com.wechat.BookReader.dao.CommentRepo;
import com.wechat.BookReader.entity.Book;
import com.wechat.BookReader.entity.Comment;
import com.wechat.BookReader.response.BookInfoVO;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    CommentRepo commentRepo;

    @Override
    public BookSimpleInfoVO[] getBooks(){
        List<Book> books = bookRepo.findAll();

        BookSimpleInfoVO[] list = new BookSimpleInfoVO[books.size()];

        for (int i = 0; i < books.size(); i ++){
            Book book = books.get(i);
            BookSimpleInfoVO bookSimpleInfoVO = new BookSimpleInfoVO(book.getBookId(),
                    book.getName(),
                    book.getWriter(),
                    book.getSummary(),
                    book.getPostUrl());
            list[i] = bookSimpleInfoVO;
        }

        return list;
    }

    public BookInfoVO getBookInfo(int bookId){
        if (bookRepo.existsById(bookId)){
            Book book = bookRepo.findById(bookId).get();
            BookInfoVO bookInfo = new BookInfoVO(book.getBookId(),
                    book.getName(),
                    book.getWriter(),
                    book.getSummary(),
                    book.getContent(),
                    book.getPostUrl(),
                    book.getStar());

            List<Comment> list = commentRepo.findByBookId(bookId);
            Comment[] comments = new Comment[list.size()];
            for (int i = 0; i < list.size(); i ++){
                comments[i] = list.get(i);
            }
            bookInfo.setComments(comments);
            return bookInfo;
        }
        return null;
    }
}
