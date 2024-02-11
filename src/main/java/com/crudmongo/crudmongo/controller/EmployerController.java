package com.crudmongo.crudmongo.controller;

import com.crudmongo.crudmongo.dto.EmployeeTO;
import com.crudmongo.crudmongo.model.Employee;
import com.crudmongo.crudmongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployerController {
 @Autowired
 private EmployeeService employeeService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String CreateEmployee(@RequestBody EmployeeTO emp){
     return employeeService.createEmployee(emp);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee>getEmployee(){
       return employeeService.getEmployee();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public String DeleteEmployee(@RequestParam String id){
         return employeeService.DeleteEmployee(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Employee UpdateEmployee(@RequestParam String id,@RequestBody EmployeeTO emp){
        return employeeService.UpdateEmployee(id,emp);
    }


    }
