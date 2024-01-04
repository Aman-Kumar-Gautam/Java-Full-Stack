package com.blog.blogger.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Data


public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String title;
    private  String description;
    private  String content;

}
