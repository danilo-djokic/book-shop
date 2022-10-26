package com.example.bookshop.model;

import lombok.Data;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = true, length = 100)
    private String username;

    @Column(name = "password", nullable = true, length = 100)
    private String password;

    @Column(name = "name", nullable = true, length = 100)
    private String name;

    @Column(name = "create_time", nullable = true)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
