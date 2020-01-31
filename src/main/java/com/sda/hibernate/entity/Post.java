package com.sda.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Post {
    @Id
    private long id;
    private String name;
    @OneToOne(mappedBy = "post")
    private PostDetails postDetails;

    public PostDetails getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(PostDetails postDetails) {
        this.postDetails = postDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
