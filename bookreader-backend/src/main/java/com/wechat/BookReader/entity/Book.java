package com.wechat.BookReader.entity;

import com.wechat.BookReader.response.BookInfoVO;
import com.wechat.BookReader.response.BookSimpleInfoVO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Book {
    @Id
    @Column
    private int bookId = 0;

    @Column
    private String name = "";

    @Column
    private String writer = "";

    @Column
    private String summary = "";

    @Column
    private String content = "";

    @Column
    private String postUrl = "";

    @Column
    private double star = 0;

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

    public BookSimpleInfoVO getBookSimpleInfoVO(){
         return new BookSimpleInfoVO(bookId,
                name,
                writer,
                summary,
                postUrl);
    }

    public BookInfoVO getBookInfoVO(){
        return new BookInfoVO(bookId,
                name,
                writer,
                summary,
                content,
                postUrl,
                star);
    }

    public Book() {
    }

    public Book(int bookId,
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
