package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Support extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 10, nullable = false)
    private String phoneNumber;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column
    private boolean status = true;

    @Column
    private boolean checked = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reason_id")
    private Reason reason;
}
