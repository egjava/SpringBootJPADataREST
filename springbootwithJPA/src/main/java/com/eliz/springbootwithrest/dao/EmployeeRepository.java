package com.eliz.springbootwithrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliz.springbootwithrest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
