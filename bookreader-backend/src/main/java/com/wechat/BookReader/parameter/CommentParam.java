package com.wechat.BookReader.parameter;

public class CommentParam {
    private String username = "";
    private int bookId = 0;
    private String comment = "";

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

    public CommentParam() {
    }

    public CommentParam(String username, int bookId, String comment) {
        this.username = username;
        this.bookId = bookId;
        this.comment = comment;
    }
}
