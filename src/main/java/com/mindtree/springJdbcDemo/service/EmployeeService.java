package com.mindtree.springJdbcDemo.service;

import java.util.List;

import com.mindtree.springJdbcDemo.entity.Employee;

public interface EmployeeService {
	public String create(Employee employee);

	public int update(Employee employee);

	public Employee read(int id);

	public int delete(int id);

	public List<Employee> getAllEmployee();

}
