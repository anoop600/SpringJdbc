package com.mindtree.springJdbcDemo.dao.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mindtree.springJdbcDemo.dao.EmployeeDao;
import com.mindtree.springJdbcDemo.entity.Employee;
import com.mindtree.springJdbcDemo.mapper.EmployeeMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final ApplicationContext context = new ClassPathXmlApplicationContext(
			"com\\mindtree\\springJdbcDemo\\util\\DBBean.xml");
	// private static final DataSource dataSource = context.getBean("dataSource",
	// DataSource.class);
	private static final JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

	public String create(Employee employee) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DBBean.xml"); dataSource =
		 * context.getBean("dataSource", DataSource.class); jdbcTemplate =
		 * context.getBean("jdbcTemplate", JdbcTemplate.class);
		 */
		// System.out.println(employee);
		String sql = "insert into employee (username, password,fullname,email,dob,gender,question,answer) values (?, ?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, employee.getUsername(), employee.getPassword(), employee.getFullName(),
				employee.getEmailid(), employee.getDob(), employee.getGender(), employee.getSecurityQuestion(),
				employee.getSecurityAnswer());
		return "Successufully Inserted";
	}

	public Employee read(int id) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DBBean.xml"); dataSource =
		 * context.getBean("dataSource", DataSource.class); jdbcTemplate =
		 * context.getBean("jdbcTemplate", JdbcTemplate.class);
		 */
		String sql = "select * from employee where id=?";
		Employee employee = jdbcTemplate.queryForObject(sql, new Object[] { id }, new EmployeeMapper());
		if (employee != null) {
			return employee;
		} else
			return null;

	}

	public int delete(int id) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DBBean.xml"); dataSource =
		 * context.getBean("dataSource", DataSource.class); jdbcTemplate =
		 * context.getBean("jdbcTemplate", JdbcTemplate.class);
		 */
		String sql = "delete from employee where id=?";
		return jdbcTemplate.update(sql, id);
	}

	public List<Employee> getAllEmployee() {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DBBean.xml"); dataSource =
		 * context.getBean("dataSource", DataSource.class); jdbcTemplate =
		 * context.getBean("jdbcTemplate", JdbcTemplate.class);
		 */
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}

	public int update(Employee employee) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com\\mindtree\\springJdbcDemo\\util\\DBBean.xml"); dataSource =
		 * context.getBean("dataSource", DataSource.class); jdbcTemplate =
		 * context.getBean("jdbcTemplate", JdbcTemplate.class);
		 */
		String sql = "update employee set email=? where id=?";
		return jdbcTemplate.update(sql, employee.getEmailid(), employee.getEmpId());
	}
	public display data(){
		System.out.println("HEllo");
	}
}
