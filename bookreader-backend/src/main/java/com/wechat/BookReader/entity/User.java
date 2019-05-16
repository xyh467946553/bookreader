package com.wechat.BookReader.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @Column
    private String openId = "";

    @Column
    private String username = "";

    /**
     * 用逗号分隔bookId
     */
    @Column
    private String bookIds = "";

    @Transient
    private ArrayList<Integer> bookIdList = new ArrayList<>();

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookIds() {
        return bookIds;
    }

    public void setBookIds(String bookIds) {
        this.bookIds = bookIds;
    }

    public ArrayList<Integer> getBookIdList() {
        return bookIdList;
    }

    public void setBookIdList(ArrayList<Integer> bookIdList) {
        this.bookIdList = bookIdList;
    }

    public boolean addBook(int bookId){
        if(bookIdList.contains(bookId)){
            return false;
        }
        stringToBookIdList();
        bookIdList.add(bookId);
        bookIds = bookIdListToString();
        return true;
    }

    public boolean deleteBook(int bookId){
        if(bookIdList.contains(bookId)) {
            stringToBookIdList();
            bookIdList.remove((Integer) bookId);
            bookIds = bookIdListToString();
            return true;
        }else {
            return false;
        }
    }

    private void stringToBookIdList(){
        if(!(bookIds.equals(""))){
            String[] temp = bookIds.split(",");
            for (int i = 0; i < temp.length; i++) {
                bookIdList.add(Integer.valueOf(temp[i]));
            }
        }
    }

    private String bookIdListToString(){
        if(bookIdList.size()>0){
            StringBuilder res = new StringBuilder();
            for(int i=0;i<bookIdList.size();i++){
                res.append(bookIdList.get(i)).append(",");
            }
            return new String(res).substring(0, res.length() - 1);
        }else {
            return "";
        }
    }

    public User() {
    }

    public User(String openId, String username, String bookIds) {
        this.openId = openId;
        this.username = username;
        this.bookIds = bookIds;
    }
}
