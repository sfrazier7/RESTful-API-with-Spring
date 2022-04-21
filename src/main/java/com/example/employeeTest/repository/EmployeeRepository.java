package com.example.employeeTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeTest.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
