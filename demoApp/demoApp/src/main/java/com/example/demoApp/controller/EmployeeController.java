package com.example.demoApp.controller;

import com.example.demoApp.dto.EmployeeDTO;
import com.example.demoApp.entity.Employee;
import com.example.demoApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

  /*  @GetMapping("/search")
    public Employee search(@RequestParam("id") Integer id){
        System.out.println("I am in search controller for employee");
        return employeeRepository.findById(id).get();
    }

    @GetMapping("/find")
    public Employee search(@RequestParam("name") String name){
        System.out.println("I am in search controller for employee");
        return employeeRepository.findByName(name);
    }*/

    @PostMapping("/add")
    public EmployeeDTO add(@RequestBody EmployeeDTO employee){
        return employeeService.add(employee);
    }

}
