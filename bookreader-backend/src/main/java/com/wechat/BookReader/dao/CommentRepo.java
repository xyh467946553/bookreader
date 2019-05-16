package com.wechat.BookReader.dao;

import com.wechat.BookReader.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {
    /**
     * 通过书的ID查找所有的评论
     * @param bookId
     * @return
     */
    List<Comment> findByBookId(int bookId);
}
