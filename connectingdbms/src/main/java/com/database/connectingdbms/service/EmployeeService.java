package com.database.connectingdbms.service;

import java.util.List;

import com.database.connectingdbms.entity.Employee;

public interface EmployeeService {
	
   public Employee saveinfo(Employee employee);

   public List<Employee> getinfo();

	public Employee getEmployeeById(long id);

	public Employee updateEmp(Employee employee);

	public List<String> getStream();
   
}
