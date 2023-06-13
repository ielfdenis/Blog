package com.denis.blog.entity;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class Comment {
    private int id;
    private Post post;
    private String username;
    private int userId;
    private String message;
    private LocalDateTime createdDate;
    @PrePersist
    protected void onCreate() {
        createdDate = LocalDateTime.now();
    }
}
