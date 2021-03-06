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

    @Column
    private String time = "";

    @Column
    private double star = 0;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public Comment() {
    }

    public Comment(int commentId, String comment, String username, int bookId,String time,double star) {
        this.commentId = commentId;
        this.comment = comment;
        this.username = username;
        this.bookId = bookId;
        this.time = time;
        this.star = star;
    }
}
