package com.restaurant.controllers;

import com.restaurant.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @CrossOrigin
    @RequestMapping(path = "/emp", method = RequestMethod.GET)
    public ResponseEntity<?> getEmp(){
        return new ResponseEntity<>(
                employeeRepository.findAll(),
                HttpStatus.OK);
    }



}
