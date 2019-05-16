package com.wechat.BookReader.controller;

import com.wechat.BookReader.bl.BookService;
import com.wechat.BookReader.response.BookInfoVO;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/getBooks")
    public BookSimpleInfoVO[] getBooks(){
        return bookService.getBooks();
    }

    @GetMapping(value = "/getInfo")
    public BookInfoVO getBookInfo(@RequestParam(value="bookId") int bookId){
        return bookService.getBookInfo(bookId);
    }
}
