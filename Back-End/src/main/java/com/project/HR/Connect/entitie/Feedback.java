package com.project.HR.Connect.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "feedback")
@Getter
@Setter
public class Feedback {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String body;

    private int rating;

    @JoinColumn(name = "created_by_id")
    @ManyToOne
    private User createdBy;

}
