package com.project.HR.Connect.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "department")
@Getter
@Setter
public class Department {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String description;

    @JoinColumn(name = "head_of_department_id")
    @ManyToOne
    private User headOfDepartment;

}
