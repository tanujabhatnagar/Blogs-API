package com.example.tanuja.BlogAPI;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    String title;
    Date publishedat;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="%,d")
    String content;
    String tag;
    public Blog() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishedat() {
        return publishedat;
    }

    public void setPublishedat(Date publishedat) {
        this.publishedat = publishedat;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


}
