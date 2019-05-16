package com.wechat.BookReader.controller;

import com.wechat.BookReader.bl.CommentService;
import com.wechat.BookReader.parameter.CommentParam;
import com.wechat.BookReader.response.BasicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/setComment")
    public BasicResponse setComment(@RequestBody CommentParam param){
        return commentService.setComment(param.getUsername(),param.getBookId(),param.getComment());
    }
}
