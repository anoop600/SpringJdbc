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

		for (int i = 0; i < 10; i++) {
			Employee emp = contextEntity.getBean("employee", Employee.class);
			emp.setUsername("Name"+i);
			emp.setPassword("Password"+i);
			emp.setFullName("FullName"+i);
			emp.setDob("Date"+i);
			emp.setEmailid(emp.getFullName()+"@gmail.com");
			emp.setGender("Male");
			emp.setSecurityQuestion("Question "+i);
			emp.setSecurityAnswer("Answer "+i);
			employeeService.create(emp);
		}

		// Insert into Employee

//		emp.setUsername("idujhcwhec1");
//		emp.setPassword("idujhcwhec1".hashCode() + "");
//		emp.setFullName("idujhcwhec1"); // emp.setDob(Date.valueOf(s.next()) + "");
//		emp.setDob("1995-12-08");
//		emp.setEmailid("idujhcw1hec");
//		emp.setGender("idujhcwh1ec");
//		emp.setSecurityQuestion("i1dujhcwhec");
//		emp.setSecurityAnswer("idu1jhcwhec");

		// System.out.println(emp);

		

		// Read//
		// System.out.println(employeeService.read(10));

		// Delete

		// System.out.println(employeeService.delete(5));

		// Get all
		employeeService.getAllEmployee().forEach(System.out::println);

		// Update

		/*
		 * Employee employee = new Employee(); employee.setEmpId(12);
		 * employee.setEmailid("hi@hi"); employeeService.update(employee);
		 */
	}
}
