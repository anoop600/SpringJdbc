package com.mindtree.springJdbcDemo;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springJdbcDemo.entity.Employee;
import com.mindtree.springJdbcDemo.service.EmployeeService;
import com.mindtree.springJdbcDemo.service.serviceImpl.EmployeeServiceImpl;

public class App {
	public static void main(String[] args) {
		// EmployeeService employeeService = new EmployeeServiceImpl();
		ApplicationContext contextEntity = new ClassPathXmlApplicationContext(
				"com\\mindtree\\springJdbcDemo\\util\\EntityBean.xml");

		ApplicationContext contextService = new ClassPathXmlApplicationContext(
				"com\\mindtree\\springJdbcDemo\\util\\ServiceBean.xml");

		EmployeeService employeeService = contextService.getBean("service", EmployeeServiceImpl.class);

		Employee emp = contextEntity.getBean("employee", Employee.class);

		// Insert into Employee

		emp.setUsername("idujhcwhec");
		emp.setPassword("aj123".hashCode() + "");
		emp.setFullName("Anoop"); // emp.setDob(Date.valueOf(s.next()) + "");
		emp.setDob("1995-12-08");
		emp.setEmailid("a@a");
		emp.setGender("male");
		emp.setSecurityQuestion("Qest");
		emp.setSecurityAnswer("Ans");

		// System.out.println(emp);

		employeeService.create(emp);

		// Read//
		// System.out.println(employeeService.read(10));

		// Delete

		// System.out.println(employeeService.delete(5));

		// Get all
		// employeeService.getAllEmployee().forEach(System.out::println);

		// Update

		/*
		 * Employee employee = new Employee(); employee.setEmpId(12);
		 * employee.setEmailid("hi@hi"); employeeService.update(employee);
		 */
	}
}
