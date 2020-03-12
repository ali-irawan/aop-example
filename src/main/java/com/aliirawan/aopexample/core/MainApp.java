package com.aliirawan.aopexample.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aliirawan.aopexample.employee.bo.EmployeeBo;

public class MainApp {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		appContext = new ClassPathXmlApplicationContext("com/aliirawan/aopexample/spring/spring-context.xml");

		EmployeeBo employee = (EmployeeBo) appContext.getBean("employeeBo");
		
		employee.addEmployee();
		
		employee.addEmployeeWithReturn();
		
		try {
			employee.addEmployeeWithException();
		} catch(Exception ex) {}
		
		employee.addEmployeeAround("John Doe");
	}

}
