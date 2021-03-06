package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDao {
	
	List<Employee> employeeys = new ArrayList<Employee>();
	
	public EmployeeDao() {
		employeeys.add(new Employee(1, "Aalam", "Mumbai"));
		employeeys.add(new Employee(2, "Wakeel", "Pune"));
		employeeys.add(new Employee(3, "Abdul", "Goa"));
	}
	

	public Employee getEmployeeById(int id) {

		List<Employee> emp = employeeys.stream().filter(emp1 -> emp1.getId() == id).collect(Collectors.toList());
		Employee employee = emp.get(0);
		return employee;
		
	}

	public List<Employee> getAllEmployee() {
		return employeeys;
		
	}

	public List<Employee> addEmployee(Employee employee) {
		
		employeeys.add(employee);
		return employeeys;
	}

}
