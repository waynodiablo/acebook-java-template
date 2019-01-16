package com.makersacademy.acebook.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String title;

    private Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

//    Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }

//    Setters
    public void setTitle(String setTitle) {
        title = setTitle;
    }

    public void setContent(String setContent) {
        content = setContent;
    }


}
