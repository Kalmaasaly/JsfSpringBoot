package com.example.demo1.controllers;

import com.example.demo1.entities.Post;
import com.example.demo1.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
//@ManagedBean(value = "post")
@RequestScoped
public class PostController implements Serializable {

    @Autowired
    private PostRepository postRepository;
    @PostConstruct
    private void init(){
        this.post=new Post();
    }

    public void addPost(){
        System.out.println(post.toString());
        postRepository.save(post);
    }




    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


}
