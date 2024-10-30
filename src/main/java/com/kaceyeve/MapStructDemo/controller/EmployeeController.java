package com.kaceyeve.MapStructDemo.controller;

import com.kaceyeve.MapStructDemo.dto.EmployeeDto;
import com.kaceyeve.MapStructDemo.entity.Employee;
import com.kaceyeve.MapStructDemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<EmployeeDto> fetchEmployee(int id){
        return new ResponseEntity<>(employeeService.fetchEmployee(id), HttpStatus.FOUND);
    }

}
