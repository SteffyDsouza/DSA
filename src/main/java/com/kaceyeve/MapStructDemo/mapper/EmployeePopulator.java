package com.kaceyeve.MapStructDemo.mapper;

import com.kaceyeve.MapStructDemo.dto.EmployeeDto;
import com.kaceyeve.MapStructDemo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeePopulator {

    EmployeePopulator INSTANCE = Mappers.getMapper(EmployeePopulator.class);

    @Mapping(source = "name", target = "empName")
    @Mapping(source = "email", target = "empEmail")
    Employee populateEmployee(EmployeeDto employeeDto);

    @Mapping(source = "empName", target = "name")
    @Mapping(source = "empEmail", target = "email")
    EmployeeDto populateEmployeeDto(Employee employee);

}
