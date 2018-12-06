package com.mindtree.springJdbcDemo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindtree.springJdbcDemo.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setUsername(rs.getString("username"));
		employee.setPassword(rs.getString("password"));
		employee.setFullName(rs.getString("fullname"));
		employee.setEmailid(rs.getString("email"));
		employee.setDob(rs.getString("dob"));
		employee.setGender(rs.getString("gender"));
		employee.setSecurityQuestion(rs.getString("question"));
		employee.setSecurityAnswer(rs.getString("answer"));
		return employee;

	}

}
