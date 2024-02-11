package com.crudmongo.crudmongo.service;

import com.crudmongo.crudmongo.dto.EmployeeTO;
import com.crudmongo.crudmongo.model.Employee;
import com.crudmongo.crudmongo.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

@Autowired
    private EmployeeRepository employeeRepository;
 public String createEmployee(EmployeeTO employeeTO){
     try{
         Employee emp=Employee.builder()
                 .empName(employeeTO.getEmpName())
                 .salary(employeeTO.getSalary())
                 .location(employeeTO.getLocation())
                 .build();
         employeeRepository.save(emp);
     }
     catch(Exception e){

     }
     return "Employee created sucessfully";
 }

 public List<Employee>getEmployee(){
     List<Employee>empList=new ArrayList<Employee>();
     try{
         empList=employeeRepository.findAll();
     }catch(Exception e){

     }
     return empList;
 }

 public String DeleteEmployee(String id){
     try{
         employeeRepository.deleteById(id);
     }catch(Exception e){

     }
     return "sucessfully deleted the employee";
 }

 public Employee UpdateEmployee(String id,EmployeeTO emp){
     Employee employee=new Employee();
     try{
    DeleteEmployee(id);
     employee=employee.builder()
            .empName(emp.getEmpName())
            .location(emp.getLocation())
            .salary(emp.getSalary())
            .build();
    employeeRepository.save(employee);

}catch(Exception e){

}
     return employee;
 }




}
