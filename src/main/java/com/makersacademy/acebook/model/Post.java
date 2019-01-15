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

    private Post() {}

    public Post(String content) {
        this.content = content;
    }

//    Added this Getter below
    public String getContent() {
        return this.content;
    }

    public long getId() {
        return this.id;
    }

}

