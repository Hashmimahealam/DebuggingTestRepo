package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		Employee employee = employeeService.getEmployeeById(id);
		return employee;
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee()
	{
		List<Employee> allEmployee = employeeService.getAllEmployee();
		return allEmployee;
	}
	
	@PostMapping("/add")
	public List<Employee> addEmployee(@RequestBody  Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
}
