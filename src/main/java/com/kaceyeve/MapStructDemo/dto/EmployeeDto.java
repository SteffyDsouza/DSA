package com.kaceyeve.MapStructDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String name;
    private int age;
    private String email;
    private int projectId;

}
