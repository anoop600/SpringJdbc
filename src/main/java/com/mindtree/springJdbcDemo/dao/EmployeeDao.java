package com.mindtree.springJdbcDemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.mindtree.springJdbcDemo.entity.Employee;

public interface EmployeeDao {

	public String create(Employee employee);

	public int update(Employee employee);

	public Employee read(int id);

	public int delete(int id);

	public List<Employee> getAllEmployee();

}
