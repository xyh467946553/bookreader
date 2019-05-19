package com.wechat.BookReader.runner;

import com.wechat.BookReader.dao.BookRepo;
import com.wechat.BookReader.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: Disclover
 * @Date: 2019/5/18 13:21
 */

@Component

public class BookRunner implements ApplicationRunner {

    @Autowired
    BookRepo bookRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book book = new Book(1,
                "计算机网络",
                "谢希仁",
                "《计算机网络》是2008年电子工业出版社出版的图书，作者是谢希仁。该书全面系统地介绍了计算机网络的发展和原理体系结构、物理层、数据链路层等内容。",
                "内容……",
                "https://imgchr.com/i/EO18XD",
                5.0);
        bookRepo.save(book);
    }
}
