package com.sda.hibernate.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PostDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private LocalDateTime creationDate;
  private LocalDateTime motificationDate;
  private String Description;
@OneToOne
@JoinColumn(name = "post_id")

  private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @PrePersist
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
@PreUpdate
    public LocalDateTime getMotificationDate() {
        return motificationDate;
    }

    public void setMotificationDate(LocalDateTime motificationDate) {
        this.motificationDate = motificationDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public PostDetails(Long id, String description) {
        this.id = id;
        Description = description;
    }

    public void setPostDetails() {
    }
}
