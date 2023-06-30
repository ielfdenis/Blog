package com.denis.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Post post;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private int userId;
    @Column(nullable = false, columnDefinition = "text")
    private String message;
    @Column(updatable = false)
    private LocalDateTime createdDate;
    @PrePersist
    protected void onCreate() {
        createdDate = LocalDateTime.now();
    }
}
