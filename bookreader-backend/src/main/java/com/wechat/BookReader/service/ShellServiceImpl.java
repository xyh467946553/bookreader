package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.ShellSerivice;
import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.stereotype.Service;

@Service
public class ShellServiceImpl implements ShellSerivice {

    @Override
    public BasicResponse addBookToShell(int bookId, String openId){
        //TODO

        return null;
    }

    @Override
    public BookSimpleInfoVO[] getShell(String openId){
        //TODO

        return null;
    }
}
