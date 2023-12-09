package com.project.HR.Connect.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "request_type")
@Getter
@Setter
public class RequestType {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String Name;

    private String templateName;

}
