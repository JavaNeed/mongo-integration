package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
