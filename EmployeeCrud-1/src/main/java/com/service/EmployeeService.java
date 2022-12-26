package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceRepository {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	
	
    @Override
	public Employee updateEmployee(Employee employee, Long id) {
    	Employee getEmployeeDb=employeeRepository.findById(id).get();
    	getEmployeeDb.setId(id);
    	getEmployeeDb.setFirstName(employee.getFirstName());
    	getEmployeeDb.setLastName(employee.getLastName());
    	getEmployeeDb.setEmailId(employee.getEmailId());
    	
    	return employeeRepository.save(getEmployeeDb);
	}

    
    @Override
    public void deleteEmployeeById(Long id) {
    	// TODO Auto-generated method stub
    	employeeRepository.deleteById(id);
    }
	
	
}
