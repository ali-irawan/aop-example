package com.aliirawan.aopexample.employee.bo;

public interface EmployeeBo {

	public void addEmployee();
	
	public String addEmployeeWithReturn();
	
	public void addEmployeeWithException() throws Exception;
	
	public void addEmployeeAround(String name);
	
}
