package com.project.HR.Connect.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "notification")
@Getter
@Setter
public class Notification {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String body;

    @JoinColumn(name = "created_by_id")
    @ManyToOne
    private User createdBy;
}
