package com.blog.blogger.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String body;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;



}
