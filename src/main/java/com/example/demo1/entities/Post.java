package com.example.demo1.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "posts")
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    private String content;
    @Column
    private boolean published;

    public Post() {
    }

    public Post(String title, String content, boolean published) {
        this.title = title;
        this.content = content;
        this.published = published;
    }

}
