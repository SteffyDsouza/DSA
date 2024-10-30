package com.kaceyeve.MapStructDemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name="t_emp")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;
    private String empName;
    private int age;
    private String empEmail;
    private int projectId;

    //not present into dto
    private Date creationDate;
}
