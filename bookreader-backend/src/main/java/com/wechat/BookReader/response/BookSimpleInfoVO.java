package com.wechat.BookReader.response;

public class BookSimpleInfoVO {
    private int bookId = 0;
    private String name = "";
    private String writer = "";
    private String summary = "";
    private String postUrl = "";

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public BookSimpleInfoVO() {
    }

    public BookSimpleInfoVO(int bookId,
                            String name,
                            String writer,
                            String summary,
                            String postUrl) {
        this.bookId = bookId;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.postUrl = postUrl;
    }
}
