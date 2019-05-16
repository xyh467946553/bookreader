package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.BookService;
import com.wechat.BookReader.response.BookInfoVO;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public BookSimpleInfoVO[] getBooks(){
        //TODO

        return null;
    }

    public BookInfoVO getBookInfo(int bookId){
        //TODO

        return null;
    }
}
