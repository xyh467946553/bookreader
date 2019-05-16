package com.wechat.BookReader.parameter;

public class UpdateBookofShelfParam {
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

    public UpdateBookofShelfParam() {
    }

    public UpdateBookofShelfParam(int bookId, String openId) {
        this.bookId = bookId;
        this.openId = openId;
    }
}
