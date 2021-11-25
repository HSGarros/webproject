package com.entity;

import java.util.Date;

public class New {
    private int id;
    private String title;
    private String content;
    private Date insertTime;

    public New() {

    }
    public New(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public New(int id, String title, String content, Date insertTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.insertTime = insertTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
