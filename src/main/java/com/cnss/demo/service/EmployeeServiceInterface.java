package com.cnss.demo.service;

import java.util.Collection;

import com.cnss.demo.domain.Employee;


public interface EmployeeServiceInterface {

	public Employee saveEmployee(Employee emp);
	public Boolean deleteEmployee(String empId);
	public Employee editEmployee(Employee emp);
	public Employee findEmployee(String empId);
	public Collection<Employee> getAllEmployees();
}
