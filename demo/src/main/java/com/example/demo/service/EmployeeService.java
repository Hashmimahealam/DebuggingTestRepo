package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public Employee getEmployeeById(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		return employee;
		
	}

	public List<Employee> getAllEmployee() {
		List<Employee> allEmployee = employeeDao.getAllEmployee();
		return allEmployee;
	}

	public List<Employee> addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
		
	}
}
