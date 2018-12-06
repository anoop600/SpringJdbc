package com.mindtree.springJdbcDemo.service.serviceImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springJdbcDemo.dao.EmployeeDao;
import com.mindtree.springJdbcDemo.dao.daoImpl.EmployeeDaoImpl;
import com.mindtree.springJdbcDemo.entity.Employee;
import com.mindtree.springJdbcDemo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private static final ApplicationContext context = new ClassPathXmlApplicationContext(
			"com\\mindtree\\springJdbcDemo\\util\\DaoBean.xml");;
	private static final EmployeeDao employeeDao = context.getBean("dao", EmployeeDaoImpl.class);

	public String create(Employee employee) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DaoBean.xml"); EmployeeDao employeeDao
		 * = context.getBean("dao", EmployeeDaoImpl.class);
		 */
		return employeeDao.create(employee);
	}

	public Employee read(int id) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DaoBean.xml"); EmployeeDao employeeDao
		 * = context.getBean("dao", EmployeeDaoImpl.class);
		 */
		return employeeDao.read(id);
	}

	public int delete(int id) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DaoBean.xml"); EmployeeDao employeeDao
		 * = context.getBean("dao", EmployeeDaoImpl.class);
		 */
		return employeeDao.delete(id);
	}

	public List<Employee> getAllEmployee() {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DaoBean.xml"); EmployeeDao employeeDao
		 * = context.getBean("dao", EmployeeDaoImpl.class);
		 */

		return employeeDao.getAllEmployee();
	}

	@Override
	public int update(Employee employee) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DaoBean.xml"); EmployeeDao employeeDao
		 * = context.getBean("dao", EmployeeDaoImpl.class);
		 */
		return employeeDao.update(employee);
	}

}
