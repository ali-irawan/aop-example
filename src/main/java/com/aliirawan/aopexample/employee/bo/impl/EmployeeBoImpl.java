package com.aliirawan.aopexample.employee.bo.impl;

import com.aliirawan.aopexample.employee.bo.EmployeeBo;

public class EmployeeBoImpl implements EmployeeBo {

	@Override
	public void addEmployee() {
		System.out.println("Add Employee");
	}

	@Override
	public String addEmployeeWithReturn() {
		System.out.println("Add Employee With Return");
		return "aop";
	}

	@Override
	public void addEmployeeWithException() throws Exception {
		System.out.println("Add Employee With Exception");
		throw new Exception("Some exception");
	}

	@Override
	public void addEmployeeAround(String name) {
		System.out.println("Add Employee Around name: " + name);
	}

}
