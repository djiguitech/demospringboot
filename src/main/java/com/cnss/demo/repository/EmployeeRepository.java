package com.cnss.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cnss.demo.domain.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String>{}
