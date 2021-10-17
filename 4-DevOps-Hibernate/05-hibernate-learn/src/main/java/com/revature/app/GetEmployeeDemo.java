package com.revature.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.app.model.Employee;

public class GetEmployeeDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction();

		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getSkillList());

		// System.out.println(employee);

		session.getTransaction().commit();

		session.close();

	}
}