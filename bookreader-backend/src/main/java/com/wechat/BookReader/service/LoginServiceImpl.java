package com.wechat.BookReader.service;

import com.wechat.BookReader.bl.LoginService;
import com.wechat.BookReader.dao.UserRepo;
import com.wechat.BookReader.entity.User;
import com.wechat.BookReader.response.BasicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepo userRepo;

    @Override
    public BasicResponse userLogin(String openId){
        if (!userRepo.existsById(openId)){
            userRepo.save(new User());
        }
        return new BasicResponse(true, openId);
    }
}
