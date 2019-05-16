package com.wechat.BookReader.controller;

import com.wechat.BookReader.bl.ShelfSerivice;
import com.wechat.BookReader.parameter.UpdateBookofShelfParam;
import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/shelf")
public class ShelfController {
    @Autowired
    private ShelfSerivice shelfSerivice;

    @PostMapping(value = "/addBook")
    public BasicResponse addBookToShelf(@RequestBody UpdateBookofShelfParam param){
        return shelfSerivice.addBookToShelf(param.getBookId(),param.getOpenId());
    }

    @PostMapping(value = "/deleteBook")
    public BasicResponse deleteBookFromShelf(@RequestBody UpdateBookofShelfParam param){
        return shelfSerivice.deleteBookFromShelf(param.getBookId(),param.getOpenId());
    }

    @GetMapping(value = "/getShelf")
    public BookSimpleInfoVO[] getShelf(@RequestParam(value="openId") String openId){
        return shelfSerivice.getShelf(openId);
    }
}
