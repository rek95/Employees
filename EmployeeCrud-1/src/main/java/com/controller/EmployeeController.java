package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import com.service.EmployeeServiceRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceRepository employeeServiceRepository;
	
	
	
	@GetMapping("/employee")
	public List<Employee> allEmployee(){
	
		return employeeServiceRepository.allEmployee();
	}


	@GetMapping("employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long Id ) {
		return employeeServiceRepository.getEmployeeById(Id);
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeServiceRepository.saveEmployee(employee);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,
			@PathVariable("id") Long id)
	{
		
		
		return employeeServiceRepository.updateEmployee(employee,id);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long Id ) {
		employeeServiceRepository.deleteEmployeeById(Id);
		return "Employee deleted having Id= "+Id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
