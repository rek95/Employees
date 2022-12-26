package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeServiceRepository {

	List<Employee> allEmployee();

	Employee getEmployeeById(Long id);

	Employee saveEmployee(Employee employee);

	Employee updateEmployee(Employee employee, Long id);

	void deleteEmployeeById(Long id);


}
