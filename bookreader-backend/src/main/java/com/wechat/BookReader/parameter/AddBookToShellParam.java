package com.wechat.BookReader.parameter;

public class AddBookToShellParam {
    private int bookId = 0;
    private String  openId = "";

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public AddBookToShellParam() {
    }

    public AddBookToShellParam(int bookId, String openId) {
        this.bookId = bookId;
        this.openId = openId;
    }
}
