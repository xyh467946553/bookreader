package com.wechat.BookReader.controller;

import com.wechat.BookReader.bl.ShellSerivice;
import com.wechat.BookReader.parameter.AddBookToShellParam;
import com.wechat.BookReader.response.BasicResponse;
import com.wechat.BookReader.response.BookSimpleInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/shell")
public class ShellController {
    @Autowired
    private ShellSerivice shellSerivice;

    @PostMapping(value = "/addBook")
    public BasicResponse addBookToShell(@RequestBody AddBookToShellParam param){
        return shellSerivice.addBookToShell(param.getBookId(),param.getOpenId());
    }

    @GetMapping(value = "/getShell")
    public BookSimpleInfoVO[] getShell(@RequestParam(value="openId") String openId){
        return shellSerivice.getShell(openId);
    }
}
