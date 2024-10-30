package com.kaceyeve.MapStructDemo.service;

import com.kaceyeve.MapStructDemo.dto.EmployeeDto;
import com.kaceyeve.MapStructDemo.entity.Employee;
import com.kaceyeve.MapStructDemo.mapper.EmployeePopulator;
import com.kaceyeve.MapStructDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeDto employeeDto){
        //code to convert dto to entity and return
        Employee employee = EmployeePopulator.INSTANCE.populateEmployee(employeeDto);
        employee.setCreationDate(new Date());
        employeeRepository.save(employee);
        return employee;
    }

    public EmployeeDto fetchEmployee(int id) {
        Employee employee = employeeRepository.findById(id).get();

        return EmployeePopulator.INSTANCE.populateEmployeeDto(employee);

    }
}
