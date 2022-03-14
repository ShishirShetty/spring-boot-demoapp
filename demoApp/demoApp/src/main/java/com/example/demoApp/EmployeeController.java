package com.example.demoApp;

import com.example.demoApp.dao.Employee;
import com.example.demoApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/search")
    public Employee search(@RequestParam("id") Integer id){
        System.out.println("I am in search controller for employee");
        return employeeRepository.findById(id).get();
    }

    @GetMapping("/find")
    public Employee search(@RequestParam("name") String name){
        System.out.println("I am in search controller for employee");
        return employeeRepository.findByName(name);
    }
    
}
