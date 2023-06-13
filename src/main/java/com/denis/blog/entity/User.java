package com.denis.blog.entity;
import com.denis.blog.enums.ERole;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private int id;
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String biography;
    private String password;
    private Set<ERole> roles = new HashSet<>();
    private List<Post> posts = new ArrayList<>();
    private LocalDateTime createdDate;
    @PrePersist
    protected void onCreate() {
        createdDate = LocalDateTime.now();
    }
}
