package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.ShelfSerivice;
import com.wechat.BookReader.dao.BookRepo;
import com.wechat.BookReader.dao.UserRepo;
import com.wechat.BookReader.entity.Book;
import com.wechat.BookReader.entity.User;
import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfServiceImpl implements ShelfSerivice {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BookRepo bookRepo;


    @Override
    public BasicResponse addBookToShelf(int bookId, String openId){
        if (userRepo.existsById(openId)){
            User user = userRepo.findById(openId).get();
            if(user.addBook(bookId)) {
                userRepo.save(user);
            }else {
                return new BasicResponse(false, "该书已被收藏！");
            }
            return new BasicResponse(true, "");
        }
        return new BasicResponse(false, "该用户不存在！");
    }

    @Override
    public BasicResponse deleteBookFromShelf(int bookId, String openId) {
        if (userRepo.existsById(openId)){
            User user = userRepo.findById(openId).get();
            user.deleteBook(bookId);
            userRepo.save(user);
            return new BasicResponse(true, "");
        }
        return new BasicResponse(false, "");
    }

    @Override
    public BookSimpleInfoVO[] getShelf(String openId){
        if (userRepo.existsById(openId)){
            User user = userRepo.findById(openId).get();
            List<Integer> list =  user.getBookIdList();
            BookSimpleInfoVO[] bookSimpleInfoVOS = new BookSimpleInfoVO[list.size()];
            for (int i = 0; i < list.size(); i ++){
                int bookId = list.get(i);
                if (bookRepo.existsById(bookId)){
                    Book book = bookRepo.findById(bookId).get();
                    BookSimpleInfoVO bookSimpleInfoVO = new BookSimpleInfoVO(book.getBookId(),
                            book.getName(),
                            book.getWriter(),
                            book.getSummary(),
                            book.getPostUrl());
                    bookSimpleInfoVOS[i] = bookSimpleInfoVO;
                }
                else {
                    return new BookSimpleInfoVO[0];
                }
            }
            return bookSimpleInfoVOS;
        }
        return new BookSimpleInfoVO[0];
    }

    @Override
    public BasicResponse getMark(String openId, int bookId){
        User user = null;
        if(userRepo.findById(openId).isPresent()){
            user = userRepo.findById(openId).get();
            List<Integer> bookIdList = user.getBookIdList();
            if(bookIdList.contains(bookId)){
                return new BasicResponse(true,"");
            }else {
                return new BasicResponse(false,"");
            }
        }else {
            return new BasicResponse(false,"未找到该用户！");
        }
    }
}
