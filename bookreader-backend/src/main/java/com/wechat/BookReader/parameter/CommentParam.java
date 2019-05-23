package com.wechat.BookReader.parameter;

public class CommentParam {
    private String username = "";
    private int bookId = 0;
    private String comment = "";
    private double star = 0;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public CommentParam() {
    }

    public CommentParam(String username, int bookId, String comment,double star) {
        this.username = username;
        this.bookId = bookId;
        this.comment = comment;
        this.star = star;
    }
}
