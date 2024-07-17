package com.database.connectingdbms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.connectingdbms.entity.Employee;
import com.database.connectingdbms.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/streamfilter")
	public List<String> getStream() {
		return employeeService.getStream();
	}
	
	@GetMapping("/getone/{id}")
	public Employee getemployeeById(@PathVariable long id) {
		return employeeService.getEmployeeById(id);
	} 
	
	@GetMapping("/fetch")
	public List<Employee> getinfo() {
		return employeeService.getinfo();
	}
	
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody Employee employee) {
		return employeeService.updateEmp(employee);
	}
	
	@PostMapping("/save")
	public Employee saveinfo(@RequestBody Employee employee) {
		return employeeService.saveinfo(employee);

	
	}
    
	}
	
