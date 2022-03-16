package com.example.demoApp.service;

import com.example.demoApp.dto.EmployeeDTO;
import com.example.demoApp.entity.Employee;
import com.example.demoApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO add(@RequestBody EmployeeDTO employee){
        // some business logic here
        Employee employeeDO = new Employee();
        employeeDO.setDept(employee.getDept());
        employeeDO.setName(employee.getFirstName()+" "+employee.getLastName());

        Employee savedEmployeeDO = employeeRepository.save(employeeDO);

        String[] names = savedEmployeeDO.getName().split(" ");
        String firstName = names[0];
        String lastName = names[1];

        return new EmployeeDTO(firstName, lastName, savedEmployeeDO.getDept());
    }

}
