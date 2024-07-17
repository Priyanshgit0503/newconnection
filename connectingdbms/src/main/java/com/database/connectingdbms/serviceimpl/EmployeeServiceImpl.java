package com.database.connectingdbms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.database.connectingdbms.entity.Employee;
import com.database.connectingdbms.repository.EmployeeRepository;
import com.database.connectingdbms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveinfo(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getinfo(){
		List<Employee> emps = employeeRepository.findAll();
		System.out.println(emps);
		return employeeRepository.findAll();
//		return employeeRepository.findAll().stream().filter(p->p.getId()==99).findFirst();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElse(null);
	}
	public Employee updateEmp(Employee employee) {
		Employee updateEmp = employeeRepository.findById(employee.getId()).orElse(null);
		if(updateEmp!=null) {
			updateEmp.setDept(employee.getDept());
			updateEmp.setName(employee.getName());
			employeeRepository.save(updateEmp);
			return updateEmp;
		}
		return null;
	}
	
	
	public List<String> getStream() {
		List<Employee> emps = employeeRepository.findAll();
		List<String> names= emps.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
		return names;

		//return employeeRepository.findAll().stream().filter(p->p.getId()==99).findFirst().get();
	}
	
	}




  