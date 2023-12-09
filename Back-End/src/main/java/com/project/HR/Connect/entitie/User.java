package com.project.HR.Connect.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity(name = "user")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    private Date joinDate;

    private float score;

    private String phoneNumber;

    @JoinColumn(name = "address_id")
    @OneToOne
    private Address address;

    @JoinColumn(name = "department_id")
    @ManyToOne
    private Department department;

    @JoinColumn(name = "login_details_id")
    @OneToOne
    private LoginDetails loginDetails;

    @JoinColumn(name = "manager_id")
    @ManyToOne
    private User manager;

}
