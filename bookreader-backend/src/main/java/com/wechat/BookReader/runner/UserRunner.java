package com.wechat.BookReader.runner;

import com.wechat.BookReader.dao.UserRepo;
import com.wechat.BookReader.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 3)
public class UserRunner implements ApplicationRunner {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User("test","test");
        user.setBookIds("1");
        userRepo.save(user);
    }
}
