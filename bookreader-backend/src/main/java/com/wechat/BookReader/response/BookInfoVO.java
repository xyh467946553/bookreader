package com.wechat.BookReader.response;

import com.wechat.BookReader.entity.Comment;

public class BookInfoVO {
    private int bookId = 0;
    private String name = "";
    private String writer = "";
    private String summary = "";
    private String content = "";
    private String postUrl = "";
    private double star = 0;
    private Comment[] comments;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public BookInfoVO() {
    }

    public BookInfoVO(int bookId,
                      String name,
                      String writer,
                      String summary,
                      String content,
                      String postUrl,
                      double star) {
        this.bookId = bookId;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.content = content;
        this.postUrl = postUrl;
        this.star = star;
    }
}
