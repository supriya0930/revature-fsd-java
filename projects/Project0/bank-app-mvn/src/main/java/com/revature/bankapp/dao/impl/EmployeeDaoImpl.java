package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.dao.EmployeeDao;
import com.revature.app.dao.Util;
import com.revature.app.model.Department;
import com.revature.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> list() throws SQLException {
		List<Employee> employeeList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * \r\n" + 
					"from employee e \r\n" + 
					"inner join department d\r\n" + 
					"on e.department_id = d.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt("e.id"));
				employee.setName(resultSet.getString("e.name"));
				employee.setSalary(resultSet.getDouble("e.salary"));
				employee.setGender(resultSet.getString("e.gender").charAt(0));
				
				Department department = new Department();
				department.setId(resultSet.getInt("d.id"));
				department.setName(resultSet.getString("d.name"));
				employee.setDepartment(department);
				
				employeeList.add(employee);
			}
		}
		return employeeList;
	}

	@Override
	public Employee get(int id) throws SQLException {
		Employee employee = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * \r\n" + 
					"from employee e \r\n" + 
					"inner join department d\r\n" + 
					"on e.department_id = d.id " + 
					"where e.id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt("e.id"));
				employee.setName(resultSet.getString("e.name"));
				employee.setSalary(resultSet.getDouble("e.salary"));
				employee.setGender(resultSet.getString("e.gender").charAt(0));
				
				Department department = new Department();
				department.setId(resultSet.getInt("d.id"));
				department.setName(resultSet.getString("d.name"));
				employee.setDepartment(department);
			}
		}
		return employee;
	}

	@Override
	public int create(Employee employee) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into employee (name, salary, gender, department_id) values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, employee.getName());
			statement.setDouble(2, employee.getSalary());
			statement.setString(3, String.valueOf(employee.getGender()));
			statement.setInt(4, employee.getDepartment().getId());
			statement.executeUpdate();
			
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		}
	}

	@Override
	public void update(Employee employee) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			connection.setAutoCommit(false);
			String sql = "update employee set name = ?, salary = ?, gender = ?, department_id = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, employee.getName());
			statement.setDouble(2, employee.getSalary());
			statement.setString(3, String.valueOf(employee.getGender()));
			statement.setInt(4, employee.getDepartment().getId());
			statement.setInt(5, employee.getId());
			statement.executeUpdate();
			connection.commit();
		}
	}

	@Override
	public void delete(int id) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "delete from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();
		}
	}

}