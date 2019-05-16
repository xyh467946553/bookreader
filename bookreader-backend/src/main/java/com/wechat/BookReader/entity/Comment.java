package com.wechat.BookReader.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_comment")
public class Comment {
    @Id
    @Column
    private int commentId = 0;

    @Column
    private String comment = "";

    @Column
    private String username = "";

    @Column
    private int bookId = 0;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Comment() {
    }

    public Comment(int commentId, String comment, String username, int bookId) {
        this.commentId = commentId;
        this.comment = comment;
        this.username = username;
        this.bookId = bookId;
    }
}
